package com.ukhomeoffice.secretcheck

import net.caoticode.buhtig.Buhtig

case class SecretDetails(filePath: String, secretString: String)

object SecretChecker {
  val token = scala.util.Properties.envOrElse("GITHUB_TOKEN", "" )
  val buhtig = new Buhtig(token)
  def getSecretForRepo(repoName: String): SecretDetails = {
//    
  }
}
