import { createApi, fetchBaseQuery } from "@reduxjs/toolkit/query/react";

export const resourceApi = createApi({
  reducerPath: "resourceApi",
  baseQuery: fetchBaseQuery({ baseUrl: "http://localhost:8080/api" }),
  tagTypes: ["AllResources"],
  endpoints: (builder) => ({
    getResources: builder.query({
      query: () => "resources",
    }),
    // inne endpointy
  }),
});

export const { useGetResourcesQuery } = resourceApi;
