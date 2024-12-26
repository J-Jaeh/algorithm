-- 코드를 입력하세요
SELECT 
    MCDP_CD AS 진료과코드,
    COUNT(*) AS 5월예약건수
FROM APPOINTMENT
WHERE APNT_YMD like '2022-05%'
GROUP BY MCDP_CD
# SELECT 에서 ' '를 사용해서 컬럼명으로 되지만 정렬에서는 ' '사용하면 문자열 처리되서 아무 의미 없는 값이됨
# 숫자로하면 되는구나 !
ORDER BY 2,1