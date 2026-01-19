const test = require("node:test");
const assert = require("node:assert/strict");

test("smoke: test runner is working", () => {
  assert.equal(1 + 1, 2);
});

test("string: basic operations", () => {
  const name = "Ada";
  assert.equal(name.toUpperCase(), "ADA");
  assert.equal(name.toLowerCase(), "ada");
});

test("array: mapping numbers", () => {
  const nums = [1, 2, 3];
  const doubled = nums.map(n => n * 2);
  assert.deepEqual(doubled, [2, 4, 6]);
});

test("object: keys and values", () => {
  const obj = { a: 1, b: 2 };
  assert.deepEqual(Object.keys(obj).sort(), ["a", "b"]);
  assert.deepEqual(Object.values(obj).sort(), [1, 2]);
});

