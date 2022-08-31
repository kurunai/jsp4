package service;

import java.util.List;

import domain.ProductVO;
import repository.ProductDAO;
import repository.ProductDAOImpl;

public class ProductServiceImpl implements ProductService {
	//dao와 연결
	private ProductDAO pdao;	//interface -> repository에 생성
	
	public ProductServiceImpl() {
		pdao = new ProductDAOImpl();	//class -> repository에 생성
	}

	@Override
	public int register(ProductVO pvo) {
		// TODO Auto-generated method stub
		return pdao.insert(pvo);
	}

	@Override
	public List<ProductVO> getList() {
		// TODO Auto-generated method stub
		return pdao.selectList();
	}

	@Override
	public ProductVO getDetail(int pno) {
		// TODO Auto-generated method stub
		return pdao.selectOne(pno);
	}

	@Override
	public int modify(ProductVO pvo) {
		// TODO Auto-generated method stub
		return pdao.update(pvo);
	}

	@Override
	public int remove(int pno) {
		// TODO Auto-generated method stub
		return pdao.delete(pno);
	}

}
