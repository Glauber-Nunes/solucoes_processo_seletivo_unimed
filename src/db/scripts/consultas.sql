
-- Junção e Ordenação--
--consulta q retorna o nome do cliente, o número do pedido e a data do pedido, ordenados pela data do pedido em ordem decrescente
select 
    C.NomeCliente,
    P.PedidoID,
    P.DataPedido
from 
    Pedidos P
join 
    Clientes C on P.ClienteID = C.ClienteID
order by 
    P.DataPedido desc;
    
--Agrupamento e Contagem
--a consulta SQL que retorne o número de produtos em cada categoria, mostrando também o nome da categoria
select 
    C.NomeCategoria,
    COUNT(P.ProdutoID) as NumeroDeProdutos
from 
    Categorias C
left join 
    Produtos P on C.CategoriaID = P.CategoriaID
group by 
    C.NomeCategoria;
 
 --Projeção e Filtros
 --consulta SQL que retorne o nome, cargo e
 --salário de todos os funcionários que têm um salário superior a 50000.
 select 
    NomeFuncionario,
    Cargo,
    Salario
from 
    Funcionarios
where 
    Salario > 50000;
    
    
--Subconsultas e Relacionamentos
--consulta SQL que retorne o nome do
--aluno e a média de suas notas
select 
    A.NomeAluno,
    AVG(N.Nota) as MediaNotas
from 
    Alunos A
join 
    Notas N on A.AlunoID = N.AlunoID
group by 
    A.NomeAluno;

--Join Múltiplo e Funções Agregadas
--onsulta SQL que
--retorne o nome do cliente, o número do pedido e a quantidade total de itens em cada pedido.
--Utilize junções múltiplas e funções agregada
select 
    C.NomeCliente,
    P.PedidoID,
    SUM(PQtd.Quantidade) as QuantidadeTotal
from 
    Clientes C
join 
    Pedidos P on C.ClienteID = P.ClienteID
left join 
    (
        select 
            PedidoID,
            COUNT(ProdutoID) as Quantidade
        from 
            Pedidos
        group by 
            PedidoID
    ) PQtd on P.PedidoID = PQtd.PedidoID
group by 
    C.NomeCliente, P.PedidoID;

    

    
