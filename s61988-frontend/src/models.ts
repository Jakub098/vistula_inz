export interface Film {
  id: number;
  nazwa: string;
  opis: string;
  dlugosc: number;
}

export interface Theater {
  id: number;
  numer: number;
}

export interface TableColumn<T> {
  header: string;
  accessor: keyof T;
}
