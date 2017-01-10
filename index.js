'use strict'
const Git = require('simple-git');
const fs = require('fs-extra');
const promisify = require("es6-promisify");
const remove = promisify(fs.remove);

function checkRepoForSecrets(gitCloneUrl) {
  return new Promise((resolve, reject) => {
    Git().clone(gitCloneUrl, './tmp')
      .branch((err, branch) => {
      if (err) {
        reject(err)
      } else {
        resolve(branch)
      }
    })
    })
  
  .then(() => remove('./tmp'))
}

checkRepoForSecrets('https://github.com/UKHomeOffice/lev-web');