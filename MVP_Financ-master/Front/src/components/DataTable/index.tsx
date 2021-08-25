import React, { useEffect, useState } from 'react';
import api from "../../api";
import { DespesaPage } from "../../types/despesa";
import { formatLocalDate } from '../../utils/format';
import styled from 'styled-components';

const Table = styled.table`

    width: 100%;
    box-shadow: 0 1px 4px 0 rgba(0,0,0,.4);
    border-spacing: 0 1px;
    text-align: left;
    border-radius: 10px;
    margin-bottom: 30px;

    th:first-child {
        border-top-left-radius: 10px;
    }

    th:last-child {
        border-top-right-radius: 10px;
    }

    tr:last-child td:first-child {
        border-bottom-left-radius: 10px;
    }

    tr:last-child td:last-child {
        border-bottom-right-radius: 10px;
    }

    th, td {
        padding: 20px 15px;
        background: #FFFFFF;
    }
    
    tbody tr {
        opacity: 0.8;

        &:hover {
            opacity: 1;
        }
    }
    
    td.preco {
        color: red;
    }
`;

const DataTable = () => {

    const [page, setPage] = useState<DespesaPage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });

    useEffect(() => {

        async function buscarDespesas() {
            const response = await api.get(`despesas/?page=0&size=5&sort=data,desc`, {
                auth: {
                  username: 'lucas',
                  password: '1234'
                }
              });
            console.log(response);
            setPage(response.data);
        
        }

        buscarDespesas();

    }, [])

    return (
        <>
            <Table>
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Preço</th>
                        <th>Categoria</th>
                        <th>Data</th>
                        <th>Descrição</th>
                    </tr>
                </thead>
                <tbody>
                    {page.content?.map(item => (
                        <tr key={item.id}>
                            <td>{item.nome}</td>
                            <td className="preco">R$ {item.preco.toFixed(2)}</td>
                            <td>{item.categoria.nomeCategoria}</td>
                            <td>{formatLocalDate(item.data, "dd/MM/yyyy")}</td>
                            <td>{item.descricao}</td>
                        </tr>
                    ))}
                </tbody>
            </Table>
        </>
    );
}

export default DataTable;