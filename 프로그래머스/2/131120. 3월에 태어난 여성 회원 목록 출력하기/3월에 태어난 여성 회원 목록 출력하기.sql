-- 코드를 입력하세요
SELECT MEMBER_ID , MEMBER_NAME , GENDER , DATE_FORMAT(DATE_OF_BIRTH , "%Y-%m-%d") as DATE_OF_BIRTH  from MEMBER_PROFILE
where TLNO is not null and DATE_FORMAT(DATE_OF_BIRTH , "%m") = "03" and GENDER = "W"
order by MEMBER_ID ASC ; 