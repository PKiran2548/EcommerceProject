package com.example.curd.opperation.controller;

import com.example.curd.opperation.dto.ApiResponse;
import com.example.curd.opperation.dto.ImageResponse;
import com.example.curd.opperation.dto.ProductDto;
import com.example.curd.opperation.helper.PagebleResponse;
import com.example.curd.opperation.service.ImageService;
import com.example.curd.opperation.service.ProductService;
import org.hibernate.engine.jdbc.StreamUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/products")
public class ProductController {


}


