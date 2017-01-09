/* PDFObject, copyright (C) 2008 Philip Hutchison (pipwerks.com). Documentation and examples are at www.pdfobject.com. Version 1.2, April 2011. MIT style license */
var PDFObject= function(y) {
	if(!y||!y.url) {
		return false;
	}
	var w="1.2",b=y.id||false,i=y.width||"100%",z=y.height||"100%",r=y.pdfOpenParams,a,x;
	var v= function() {
		var c=null;
		if(window.ActiveXObject) {
			c=new ActiveXObject("AcroPDF.PDF");
			if(!c) {
				c=new ActiveXObject("PDF.PdfCtrl");
			}
			if(c!==null) {
				return true;
			}
		}
		return false;
	};
	var u= function() {
		var c,f=navigator.plugins,d=f.length,e=/Adobe Reader|Adobe PDF|Acrobat/gi;
		for(c=0;c<d;c++) {
			if(e.test(f[c].name)) {
				return true;
			}
		}
		return false;
	};
	var t= function() {
		var c=navigator.mimeTypes["application/pdf"];
		return(c&&c.enabledPlugin);
	};
	var s= function() {
		var c=null;
		if(u()||v()) {
			c="Adobe";
		} else {
			if(t()) {
				c="generic";
			}
		}
		return c;
	};
	var q= function() {
		var e=document.getElementsByTagName("html");
		if(!e) {
			return false;
		}
		var c=e[0].style,d=document.body.style;
		c.height="100%";
		c.overflow="hidden";
		d.margin="0";
		d.padding="0";
		d.height="100%";
		d.overflow="hidden";
	};
	var p= function(d) {
		var c="",e;
		if(!d) {
			return c;
		}
		for(e in d) {
			if(d.hasOwnProperty(e)) {
				c+=e+"=";
				if(e==="search") {
					c+=encodeURI(d[e]);
				} else {
					c+=d[e];
				}
				c+="&";
			}
		}
		return c.slice(0,c.length-1);
	};
	var o= function(d) {
		var c=null;
		switch(d) {
			case"url":
				c=a;
				break;
			case"id":
				c=b;
				break;
			case"width":
				c=i;
				break;
			case"height":
				c=z;
				break;
			case"pdfOpenParams":
				c=r;
				break;
			case"pluginTypeFound":
				c=x;
				break;
			case"pdfobjectversion":
				c=w;
				break;
		}
		return c;
	};
	var n= function(d) {
		if(!x) {
			return false;
		}
		var c=null;
		if(d) {
			c=(d.nodeType&&d.nodeType===1)?d:document.getElementById(d);
			if(!c) {
				return false;
			}
		} else {
			c=document.body;
			q();
			i="100%";
			z="100%";
		}
		c.innerHTML='<object	data="'+a+'" type="application/pdf" width="'+i+'" height="'+z+'"></object>';
		return c.getElementsByTagName("object")[0];
	};
	a=encodeURI(y.url)+"#"+p(r);
	x=s();
	this.get= function(c) {
		return o(c);
	};
	this.embed= function(c) {
		return n(c);
	};
	return this;
};

var pdfs, index = 0;

function pdfInit() {
	$.getJSON("navigationinfo/navi_data/pdfs.json", function(data) {
		pdfs = data;
		loadPdf(pdfs.pdf[index].source);
	});
}

function pdfNext() {
	if(index < pdfs.pdf.length-1) {
		index++;
		loadPdf(pdfs.pdf[index].source);
	}
}

function pdfPrev() {
	if(index > 0) {
		index--;
		loadPdf(pdfs.pdf[index].source);
	}
}

function loadPdf(fileurl) {
	var params = {
		url: fileurl,
		pdfOpenParams: {
			navpanes: 0,
			toolbar: 1,
			statusbar: 0,
			view: "FitV"
		}
	};
	var testpdf = new PDFObject(params);
	var myPDF = new testpdf.embed("pdfObject");
}
