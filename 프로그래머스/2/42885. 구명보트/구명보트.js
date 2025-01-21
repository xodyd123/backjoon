function solution(people, limit) {
  let biggest = 0,
    count = 0,
    i = 0;
  people.sort((a, b) => a - b);
  while (people.length > 0) {
    biggest = people.pop();
    i = 0;
    while (people[i] <= limit - biggest) i++;
    if (i) people.splice(i - 1, 1);
    count++;
  }
  return count;
}