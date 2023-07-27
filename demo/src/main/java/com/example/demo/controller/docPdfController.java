package com.example.demo.controller;


import com.example.demo.model.docPdf;
import com.example.demo.service.docPdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/docPdf")
@CrossOrigin
public class docPdfController {

    @Autowired
    private docPdfService docpdfService;

    @PostMapping("/add")
    public String add(@RequestBody docPdf docpdf) {
        docpdfService.savePdf(docpdf);
        return "New pdf is added";
    }

    @GetMapping("/getAll")
    public List<docPdf> getAllPdfs(){
        return docpdfService.getAllPdfs();
    }

    @GetMapping("/getAll/{id}")
    public docPdf getPdf(Integer id){
        return docpdfService.getPdf(id);
    }

    @DeleteMapping("/delete/{id}")
    public String removePdf(@PathVariable Integer id) {
        docpdfService.removePdf(id);
        return "Pdf " + id + " is deleted";
    }
}
