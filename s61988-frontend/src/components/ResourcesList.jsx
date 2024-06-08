import React from "react";
import { useGetResourcesQuery } from "../store/api/resources";
import { useTable } from "react-table";
import { useMemo } from "react";

const ResourcesList = () => {
  const { data: allResources, isLoading } = useGetResourcesQuery();

  const columns = useMemo(
    () => [
      { header: "ID", accessor: "id" },
      { header: "Nazwa", accessor: "title" },
      { header: "Data wydania", accessor: "realiseDate" },
      { header: "Kategoria", accessor: "category.name" },
      { header: "Imie autora", accessor: "author.name" },
      { header: "Nazwisko autora", accessor: "author.surname" },
    ],
    [allResources]
  );

  const { getTableProps, getTableBodyProps, headerGroups, rows, prepareRow } =
    useTable({ columns, data: allResources ?? [] });

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

export default ResourcesList;
