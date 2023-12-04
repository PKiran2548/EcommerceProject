package com.example.curd.opperation.serviceImpl;

import com.example.curd.opperation.dto.ProductDto;
import com.example.curd.opperation.entity.Category;
import com.example.curd.opperation.entity.Product;
import com.example.curd.opperation.exception.ResourceNotFoundException;
import com.example.curd.opperation.helper.Helper;
import com.example.curd.opperation.helper.PagebleResponse;
import com.example.curd.opperation.repository.CategoryRepo;
import com.example.curd.opperation.repository.ProductRepo;
import com.example.curd.opperation.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

}
