package service;

import java.util.List;

import domain.ProductVO;

public interface ProductService {

	int register(ProductVO pvo);

	List<ProductVO> getList();

	ProductVO getDetail(int pno);

	int modify(ProductVO pvo);

	int remove(int pno);

}
