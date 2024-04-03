import { createApi, fetchBaseQuery } from "@reduxjs/toolkit/query/react";
import { Theater } from "../../models";

export const theaterApi = createApi({
  reducerPath: "theaterApi",
  baseQuery: fetchBaseQuery({ baseUrl: "http://localhost:8080/api" }),
  tagTypes: ["Theater"],
  endpoints: (builder) => ({
    getTheaters: builder.query<Theater[], void>({
      query: () => "halls",
    }),
  }),
});

export const { useGetTheatersQuery } = theaterApi;
