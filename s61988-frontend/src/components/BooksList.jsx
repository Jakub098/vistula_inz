import React from "react";
import { useGetBooksQuery } from "../store/api/books";
import { useTable } from "react-table";
import { useMemo } from "react";

const BooksList = () => {
  const { data: allBooks, isLoading } = useGetBooksQuery();
  const columns = useMemo(() => [{ header: "ID", accessor: "id" }], [allBooks]);

  const { getTableProps, getTableBodyProps, headerGroups, rows, prepareRow } =
    useTable({ columns, data: allBooks ?? [] });

  return (
    <>
      <h1>Katalog online</h1>
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

export default BooksList;
