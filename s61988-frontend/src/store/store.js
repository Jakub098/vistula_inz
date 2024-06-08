import { configureStore } from "@reduxjs/toolkit";
import { setupListeners } from "@reduxjs/toolkit/query/react";
import { resourceApi } from "./api/resources";
import { booksApi } from "./api/books";

export const store = configureStore({
  reducer: {
    [resourceApi.reducerPath]: resourceApi.reducer,
    [booksApi.reducerPath]: booksApi.reducer,
  },
  middleware: (getDefaultMiddleware) =>
    getDefaultMiddleware().concat(resourceApi.middleware, booksApi.middleware),
});

setupListeners(store.dispatch);

// export type RootState = ReturnType<typeof store.getState>;
// export type AppDispatch = typeof store.dispatch;

export default store;
