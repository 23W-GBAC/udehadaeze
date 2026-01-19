const test = require("node:test");
const assert = require("node:assert/strict");

test("smoke: CI test runner works", () => {
  assert.equal(true, true);
});

test("basic: math still works", () => {
  assert.equal(2 + 2, 4);
});

test("basic: strings still work", () => {
  assert.equal("hello".toUpperCase(), "HELLO");
});

test("basic: arrays still work", () => {
  assert.deepEqual([1, 2, 3].map(n => n * 2), [2, 4, 6]);
});

