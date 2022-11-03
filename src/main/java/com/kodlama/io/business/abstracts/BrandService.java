package com.kodlama.io.business.abstracts;

import com.kodlama.io.business.requests.CreateBrandRequest;
import com.kodlama.io.business.responses.GetAllBrandsResponse;
import com.kodlama.io.entities.concrete.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
