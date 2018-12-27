module.exports = {
  entry: {
    './target/classes/static/built/bundle-client.js': './src/main/js/client/client.js',
    './target/classes/js/built/bundle-server.js': './src/main/js/server/server.js'
  },
  output: {
    path: __dirname,
    filename: '[name]'
  },
  module: {
    rules: [
      {
        test: /\.js$/,
        exclude: /node_modules/,
        use: 'babel-loader'
      }
    ]
  },
  performance: {
    hints: false
  }
}