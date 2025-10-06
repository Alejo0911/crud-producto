package com.alejo0911.crud_producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alejo0911.crud_producto.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {}