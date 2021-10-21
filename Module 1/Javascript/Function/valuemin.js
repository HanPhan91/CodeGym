function main() {
  let arr1 = [3, 5, 1, 8, -3, 7, 8];
  let arr2 = [7, 12, 6, 9, 20, 56, 89];
  let arr3 = [];
  let arr4 = [0, 0, 0, 0, 0, 0];
  let value = 4;
  position = findArray(arr1, value);
  if (position == -1) console.log(`${value} không có trong mảng`);
  else console.log(` Vị trí ${value} cần tìm trong mảng là: ${position}`);
}
main();
function findArray(array, value) {
  if (array.length == 0) {
    return -1;
  } else {
    for (let i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      } 
      else {
          return -1;
      }
    }
  }
}
