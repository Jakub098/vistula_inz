import { useMemo } from "react";
import { Theater, TableColumn } from "../models";
import { useGetFilmsQuery } from "../store/endpoints/movie";

import { useTable } from "react-table";
import { useGetTheatersQuery } from "../store/endpoints/theater";

const Theaters = () => {
  const { data: theatersData, isLoading } = useGetTheatersQuery();

  const columns: TableColumn<Theater>[] = useMemo(
    () => [
      { header: "ID", accessor: "id" },
      { header: "Numer", accessor: "numer" },
    ],
    [theatersData]
  );

  const { getTableProps, getTableBodyProps, headerGroups, rows, prepareRow } =
    useTable({ columns, data: theatersData ?? [] });

  return (
    <>
      <h1>Sale kinowe</h1>
      <br />
      <p>
        Dysponujemy najnowocześniejszymi salami kinowymi! Przedstawiamy listę
        oraz galerię
      </p>
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

export default Theaters;
