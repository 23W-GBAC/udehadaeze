const test = require("node:test");
const assert = require("node:assert/strict");

test("sanity: date objects can be created", () => {
  const d = new Date("2026-01-19T00:00:00Z");
  assert.equal(Number.isNaN(d.getTime()), false);
});

test("sanity: JSON round-trip works", () => {
  const obj = { a: 1, b: "x", c: true, d: [1, 2] };
  const back = JSON.parse(JSON.stringify(obj));
  assert.deepEqual(back, obj);
});

