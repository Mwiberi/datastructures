public class Encrypt {
    fun encryptPassword(): String {
    password ="ewfdfr"
    certificate ="MIIDNjCCAh6gAwIBAgIQBZjSTYupTliYoigNionQzzANBgkqhkiG9w0BAQsFADAYMRYwFAYDVQQDEw1PbmVFcXVpdHkuY29tMB4XDTIwMDgyNDA0NDk1NFoXDTIxMDgyNDA0NTk1NFowGDEWMBQGA1UEAxMNT25lRXF1aXR5LmNvbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAK+LA6aLXuZkWqTJNiV3187ZoERCepDMMuj420nP+5qY6xfZIn3WQQtVUkf7b2C7kbtqj4mxnd1MRpawagMDmQbr+L7GdFbc1VlREQ60HQmGmM4zaA6+w4vhcat7bOmwi+g6Xq405a+/rPwK+FS8xXRJ1pMSYKo8bx81vYVIiEg/oB0CRPOYZY9dKxkCTlCLaUQ3LNX/KjBAApF6GjEztIkduisSycrI34gEIvF4Z3fhu6kYwzh/eu4xiJ5NrYC+pIh10GCMm4KNT7VPvmC1KZw7ZZWV0jkKZh197Awfw9zFXxLwrRziQcuigU89p7sSRvpUbv8VJd78GY5UGSgirvsCAwEAAaN8MHowDgYDVR0PAQH/BAQDAgWgMAkGA1UdEwQCMAAwHQYDVR0lBBYwFAYIKwYBBQUHAwEGCCsGAQUFBwMCMB8GA1UdIwQYMBaAFBpfZz4X5Earwf4cYaolDV4HuRzjMB0GA1UdDgQWBBQaX2c+F+RGq8H+HGGqJQ1eB7kc4zANBgkqhkiG9w0BAQsFAAOCAQEAojfGRHMEKp2eN3E21+tT6W8+lS14dEg8tSkcVPk946zIova7+6O4WFgQ1WTDqm/i4AqoK58f8mmNrMeuH+qEvUsvGZf4VXW+Q7xehJjgHGus2zHlRu6/VYpnJqrbPHlfs8nHXMpV2FUxlQgXmXjiwQ5lKvjeF/cWSjjozYu8xDfZ2qHJ9skoSucHWKwbXKyEtHmj4Cx+IsGov4Q8ZwqKZim/Ey1dTrL4p/oqRTMmnCyT8ojqr+AEILgBXZJbtLmESlE55O850VN1oejakwnM2sfneTFVv2FA4PzUnar3U/dRc0T+HIEg7IYO/Mmx9pktDIJBg5fshbr55i4xgRVm0A=="
val RSA_CONFIG = "RSA/ECB/OAEPWITHSHA-256ANDMGF1PADDING"
var cert = X509Certificate.getInstance(Base64.decode(certificate, Base64.NO_WRAP))
var publicKey = cert.publicKey
val c: Cipher = Cipher.getInstance(RSA_CONFIG)
c.init(Cipher.ENCRYPT_MODE, publicKey, OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256,
PSource.PSpecified.DEFAULT))
val base64EncryptedPass = Base64.encode(c.doFinal(password.toByteArray()), Base64.NO_WRAP)
print(base64EncryptedPass)
return String(base64EncryptedPass)
}

// Hello World Program

fun main(args : Array<String>) {
    println("Hello, World!")
}
}
