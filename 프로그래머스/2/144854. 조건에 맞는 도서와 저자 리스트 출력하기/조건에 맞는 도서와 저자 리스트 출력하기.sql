-- 코드를 입력하세요
SELECT book_id , AUTHOR_NAME , DATE_FORMAT(PUBLISHED_DATE , "%Y-%m-%d") 
from BOOK inner join AUTHOR on book.AUTHOR_ID = AUTHOR.AUTHOR_ID where CATEGORY = "경제" 
order by PUBLISHED_DATE ; 