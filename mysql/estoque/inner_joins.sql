SELECT 
    tb_produtos.nome, tb_produtos.preco, tb_marcas.nome
FROM
    tb_produtos
        INNER JOIN
    tb_marcas ON tb_marcas.id = tb_produtos.marca_id
WHERE
    tb_marcas.nome LIKE '%ni%'
        AND tb_produtos.preco < 500
        OR tb_produtos.nome = 'Camiseta';*/
                    
SELECT 
    tb_produtos.nome, tb_produtos.preco, tb_marcas.nome
FROM
    tb_produtos
        RIGHT JOIN
    tb_marcas ON tb_marcas.id = tb_produtos.marca_id;
    
SELECT 
    tb_produtos.nome, tb_produtos.preco, tb_marcas.nome
FROM
    tb_produtos
        LEFT JOIN
    tb_marcas ON tb_marcas.id = tb_produtos.marca_id; */