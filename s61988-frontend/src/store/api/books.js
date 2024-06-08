import { createApi, fetchBaseQuery } from "@reduxjs/toolkit/query/react";

export const booksApi = createApi({
  reducerPath: "booksApi",
  baseQuery: fetchBaseQuery({ baseUrl: "http://localhost:8080/api" }),
  tagTypes: ["AllBooks"],
  endpoints: (builder) => ({
    getBooks: builder.query({
      query: () => "books",
    }),
    // inne endpointy
  }),
});

export const { useGetBooksQuery } = booksApi;
