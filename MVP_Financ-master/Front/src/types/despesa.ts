import { Categoria } from "./categoria";

export type Despesa = {
    id: number;
    nome: string;
    preco: number;
    data: string;
    descricao: string;
    categoria: Categoria;
}

export type DespesaPage = {
    content?: Despesa[];
    last: boolean,
    totalPages: number,
    totalElements: number,
    size?: number,
    number: number,
    first: boolean,
    numberOfElements?: number,
    empty?: boolean
}

export type DespesaSoma = {
    categoriaNome: string;
    soma: number;
}