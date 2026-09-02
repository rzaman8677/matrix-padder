# Matrix Padder

A small Java utility that converts a 1D integer array into a 2D matrix with a fixed number of columns and pads any remaining cells with a specified value.

## Features

- Converts `int[]` data into `int[][]`
- Supports configurable column count
- Pads incomplete final rows with a custom padding value

## API

### `createPaddedMatrix(int[] arr, int columns, int pad)`

Returns a 2D matrix with:

- `columns` columns in every row
- Enough rows to contain all values from `arr`
- Remaining cells (if any) filled with `pad`

#### Parameters

- `arr`: Input integer array
- `columns`: Number of columns per row
- `pad`: Padding value for unused cells

#### Returns

- `int[][]`: Padded 2D matrix

## Example

Input:

- `arr = [1, 2, 3, 4, 5]`
- `columns = 3`
- `pad = 0`

Output:

```text
[
  [1, 2, 3],
  [4, 5, 0]
]
```

## Project Structure

- `/src/MatrixPadder.java` – Main implementation
- `/lib/MatrixPadder.jar` – Compiled library artifact

## Build

This repository is a plain Java project (no Maven/Gradle wrapper included). From the repository root:

```bash
javac -cp lib/MatrixPadder.jar -d bin src/MatrixPadder.java
```

## Run

`MatrixPadder.main` launches an acceptance tester from `lib/MatrixPadder.jar` and expects interactive console input.