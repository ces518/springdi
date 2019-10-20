package me.june.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 20/10/2019
 * Time: 11:06 오후
 **/
@Service
public class BookService {

    @Autowired BookRepository bookRepository;

}
