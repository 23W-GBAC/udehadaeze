const test = require("node:test");
const assert = require("node:assert/strict");
const { bmiCalculatorFormula } = require("../myStarterCodes/myJavaScriptFile");

test("codebase: bmiCalculatorFormula is available", () => {
  assert.equal(typeof bmiCalculatorFormula, "function");
  const result = bmiCalculatorFormula(60, 170);
  assert.equal(Number.isNaN(result), false);
});

