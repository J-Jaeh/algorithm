-- 코드를 입력하세요
SELECT 
    p.product_code AS PRODUCT_CODE,
    SUM(p.price * s.sales_amount) AS 'SALES'
FROM PRODUCT p
INNER JOIN OFFLINE_SALE s ON p.PRODUCT_ID = s.PRODUCT_ID
GROUP BY p.product_code
ORDER BY 2 DESC,1