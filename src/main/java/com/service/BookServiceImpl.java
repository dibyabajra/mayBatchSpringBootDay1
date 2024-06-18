package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookDao;
import com.dto.BookDTO;
import com.entity.BookEntity;

@Service
@Transactional
public abstract class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;


	@Override
	public void registerBook(com.dto.BookDTO bookDTO) {
		
		BookEntity bookEntity=new BookEntity();
		
		//copy bookDTO to bookEntity
		BeanUtils.copyProperties(bookDTO, bookEntity);
		bookDao.save(bookEntity); //bookEntity object will be saved in table as a record
		
	}


	@Override
	public List<com.dto.BookDTO> findAllBooks() {
		List<BookEntity> bookEntity=bookDao.findAll();
		
		List<com.dto.BookDTO>  bookDtoList=new ArrayList<>();     //blank arrayList
		
		//if(bookEntity.isEmpty()) {
			//Returns true if this list contains no elements.<----isEmpty()
			if(bookEntity.size()>0) {
			           for(BookEntity   tempa:bookEntity) {
			        	                    //1st          //3
			        	   com.dto.BookDTO bookDTO=new com.dto.BookDTO();
			        	   
			        	   BeanUtils.copyProperties(tempa,bookDTO );
			        	                             //1st    //copied in bookDTO
			        	                      //2nd   //3rd
			        	   
			        	   bookDtoList.add(bookDTO); //in first iteration, first object has been added in blank arrayList
			           }
			      }
		
		return bookDtoList; //bookDtoList<---it is collection of records in the form of objects
	}

   //delete operation
	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteById(bookId);
		
	}

     //fetch the data on edit form (updateBook)
	@Override
	public BookDTO fetchRecord(int bookId) {
		Optional<BookEntity> optional=bookDao.findById(bookId);
		com.dto.BookDTO bookDTO=null;
		
		if(optional.isPresent()) {
			BookEntity bookEntity=optional.get();
			bookDTO=new com.dto.BookDTO();
			
			BeanUtils.copyProperties(bookEntity, bookDTO);
			
			return bookDTO;
		}else {
			
			return bookDTO;
		}
	}


	//edit operation- tier-II (updated data are being saved in table)
	@Override
	public void updateBook(com.dto.BookDTO bookDTO) {
		
		BookEntity bookEntity=new BookEntity();
		
		BeanUtils.copyProperties(bookDTO,bookEntity);
		bookDao.save(bookEntity);
		
	}
	
	
}
