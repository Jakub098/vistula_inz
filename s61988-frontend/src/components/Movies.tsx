import { useMemo } from "react";
import { Film, TableColumn } from "../models";
import { useGetFilmsQuery } from "../store/endpoints/movie";

import { useTable } from "react-table";

const Movies = () => {
  const { data: moviesData, isLoading } = useGetFilmsQuery();

  const columns: TableColumn<Film>[] = useMemo(
    () => [
      { header: "ID", accessor: "id" },
      { header: "Nazwa", accessor: "nazwa" },
      { header: "Opis", accessor: "opis" },
      { header: "Długość", accessor: "dlugosc" },
    ],
    [moviesData]
  );

  const { getTableProps, getTableBodyProps, headerGroups, rows, prepareRow } =
    useTable({ columns, data: moviesData ?? [] });

  return (
    <>
      <h1>Filmy</h1>
      {isLoading ? (
        <p>Loading...</p>
      ) : (
        <table {...getTableProps()}>
          <thead>
            {headerGroups.map((headerGroup) => (
              <tr {...headerGroup.getHeaderGroupProps()}>
                {headerGroup.headers.map((column) => (
                  <th {...column.getHeaderProps()}>
                    {column.render("header")}
                  </th>
                ))}
              </tr>
            ))}
          </thead>
          <tbody {...getTableBodyProps()}>
            {rows.map((row) => {
              prepareRow(row);
              return (
                <tr {...row.getRowProps()}>
                  {row.cells.map((cell) => (
                    <td {...cell.getCellProps()}>{cell.render("Cell")}</td>
                  ))}
                </tr>
              );
            })}
          </tbody>
        </table>
      )}
    </>
  );
};

export default Movies;
