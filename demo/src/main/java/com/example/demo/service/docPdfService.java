package com.example.demo.service;


import com.example.demo.model.docPdf;

import java.util.List;


public interface docPdfService {


    public docPdf savePdf(docPdf docpdf);

    public List<docPdf> getAllPdfs();

    public docPdf getPdf(Integer id);

    public void removePdf(Integer id);
}
