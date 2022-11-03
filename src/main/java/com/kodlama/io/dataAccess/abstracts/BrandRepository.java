package com.kodlama.io.dataAccess.abstracts;

import com.kodlama.io.business.responses.GetAllBrandsResponse;
import com.kodlama.io.entities.concrete.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer>{
}
