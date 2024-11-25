
 const { Sequelize } = require('sequelize');

// Crear una nueva instancia de Sequelize para conectarse a MySQL
/**const sequelize = new Sequelize('tpf_db_d', 'root', 'PVisual23/9-', {
  host: 'localhost',
  dialect: 'mysql',  // Usamos MySQL como dialecto
  port: 3306,        // El puerto por defecto de MySQL
});*/

const sequelize = new Sequelize({
  host: process.env.DB_HOST,
  dialect: 'mysql',
  port: process.env.DB_PORT,
  username: process.env.DB_USER,  
  password: process.env.DB_PASSWORD,
  database: process.env.DB_NAME,    
  logging: false,             
});

module.exports = sequelize;



