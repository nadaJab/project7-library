package com.libraryWS.contract;

import com.libraryWS.contract.manager.*;

public interface ManagerFactory {

       UserManager getUserManager();
       BookManager getBookManager();
       AuthorManager getAuthorManager();
       BorrowingBookManager getBorrowingBookManager();
}
