# TextAnalyzer

	String makeCaps (String text) - возвращает исходный текст, записанный ПРОПИСНЫМИ буквами.
	
	Int countOneWord (String text, String word) - возвращает количество слов word в тексте text.
	
	(uChar, Int) [] countCharacters (String text) - возвращает массив, 
	содержащий набор пар (символ, количество), отражающий информацию, 
	по количеству использования каждого символа в тексте.
	
	(String, Int) [] countWords (String text) - возвращает массив,
	содержащий набор пар (слово, количество), отражающий информацию,
	по количеству использования каждого из слов в тексте.
	
	Разместить разработанный веб-сервис на облачной платформе.	* 2 балла
	
	Реализовать метод (String Int) [] countWordsOnWebPage (String URL), 
	возвращающий информацию по количеству слов на веб-странице с адресом URL	 * 3 балла


Client 

python

import requests

r = requests.post('http://127.0.0.1:8080/toUpper', data="qwertyuiop")
print(r.text)

r1 = requests.post('http://127.0.0.1:8080/countCharacters', data="qwertyuiopqwertqwe")
print(r1.text)

r2 = requests.post('http://127.0.0.1:8080/countWords', data="qwerty uiop qwert qwe the the the")
print(r2.text)

r3 = requests.post('http://127.0.0.1:8080/count_one_word/the', data="qwertyuiopqwertqwe the the the")
print(r3.text)
