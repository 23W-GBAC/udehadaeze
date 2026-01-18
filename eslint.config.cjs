module.exports = [
  {
    languageOptions: {
      ecmaVersion: "latest",
      sourceType: "module",
      globals: {
        // Browser globals
        window: "readonly",
        document: "readonly",
        console: "readonly",
        // Node.js globals
        require: "readonly",
        module: "readonly",
        exports: "readonly",
        process: "readonly",
        __dirname: "readonly",
        __filename: "readonly",
        Buffer: "readonly",
        global: "readonly",
      },
    },
    rules: {
      "no-unused-vars": ["warn", { argsIgnorePattern: "^_" }],
      "no-console": "off",
      "no-undef": "error",
    },
  },
];
