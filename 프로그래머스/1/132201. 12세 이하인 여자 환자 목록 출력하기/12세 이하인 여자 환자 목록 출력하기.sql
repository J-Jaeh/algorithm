SELECT 
    PT_NAME,
    PT_NO,
    GEND_CD,
    AGE,
    CASE 
        WHEN TLNO IS NULL THEN 'NONE'
        ELSE TLNO
    END 'TLNO'
FROM PATIENT
WHERE GEND_CD ='W'AND AGE <13
ORDER BY 4 DESC,1