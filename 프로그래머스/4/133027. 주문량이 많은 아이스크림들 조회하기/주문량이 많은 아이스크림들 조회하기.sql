-- 코드를 입력하세요
SELECT fl.FLAVOR 
FROM
(
SELECT f.FLAVOR ,
    (
    f.TOTAL_ORDER +
        ( SELECT SUM(sj.TOTAL_ORDER)
          FROM JULY sj
          WHERE f.FLAVOR =sj.FLAVOR
        )
    )  as sum_fj
FROM FIRST_HALF f 
INNER JOIN JULY j ON f.SHIPMENT_ID = j.SHIPMENT_ID
ORDER BY  sum_fj DESC   
) fl
LIMIT 3
