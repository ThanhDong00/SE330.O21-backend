package com.nhom12.website_ban_sach.mapper;

import com.nhom12.website_ban_sach.dto.dto_entity.DanhMucDTO;
import com.nhom12.website_ban_sach.entity.DanhMuc;

public class DanhMucMapper {
    
    //map data to danhmuc 
    public static DanhMuc mapToDanhMuc(DanhMucDTO cDTO){
        return new DanhMuc(cDTO.getId(), cDTO.getTenDanhMuc());
    }

    //map data to danhmucDTO
    public static DanhMucDTO mapToDanhMucDTO(DanhMuc c){
        return new DanhMucDTO(c.getId(), c.getTenDanhMuc());
    }
}
