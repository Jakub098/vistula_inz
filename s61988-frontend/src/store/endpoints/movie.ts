import { createApi, fetchBaseQuery } from "@reduxjs/toolkit/query/react";
import { Film } from "../../models";

export const movieApi = createApi({
  reducerPath: "movieApi",
  baseQuery: fetchBaseQuery({ baseUrl: "http://localhost:8080/api" }),
  tagTypes: ["Film"],
  endpoints: (builder) => ({
    getFilms: builder.query<Film[], void>({
      query: () => "films",
    }),
    // Dodaj inne endpointy, jeśli są
  }),
});

export const { useGetFilmsQuery } = movieApi;
