package com.example.demo.service;

import com.example.demo.model.docPdf;
import com.example.demo.repository.docPdfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class docPdfServiceImpl implements docPdfService {
    @Autowired
    private docPdfRepository docpdfrepository;

    @Override
    public docPdf savePdf(docPdf docpdf) {

        return docpdfrepository.save(docpdf);
    }

    @Override
    public List<docPdf> getAllPdfs() {

        return docpdfrepository.findAll();
    }

    @Override
    public docPdf getPdf(Integer id) {
        return docpdfrepository.getReferenceById(id);
    }

    @Override
    public void removePdf(Integer id) {
        docpdfrepository.deleteById(id);
    }
}
