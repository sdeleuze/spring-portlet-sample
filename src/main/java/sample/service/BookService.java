/*
 * Copyright 2005-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.service;

import java.util.SortedSet;

import sample.domain.Book;

public interface BookService {

	public Book getBook(Integer key);

	public Book getBook(int key);

	public SortedSet<Book> getAllBooks();

	public int addBook(Book book);

	public int addBook(String author, String title, Integer count);

	public int addBook(String author, String title, int count);

	public void saveBook(Book book);

	public void deleteBook(Integer key);

	public void deleteBook(Book book);

	public void deleteBook(int key);

}