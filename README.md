# java-project-template

MavenとDev Containerで開発するJavaプロジェクトのテンプレートです。

## 必要な環境

- JDK 25
- Maven 3.10以降

[Dev Container](./.devcontainer/devcontainer.json)には両方のツールが含まれているため、Dev Containerを使う場合はローカルへのインストールは不要です。

## プロジェクト構成

```text
.
├── .devcontainer/   Dev Containerの定義
├── .githooks/       Gitフック（コミットメッセージの検証）
├── .github/         Copilotの指示、Issueテンプレート、PRテンプレート、スキル
├── docs/            ドキュメント
├── src/main/        アプリケーションのコードとリソース
├── src/test/        テスト（JUnit 5）とテスト用リソース
└── pom.xml          Mavenのビルド定義
```

## テスト

```bash
mvn test      # コンパイルしてテストを実行
mvn verify    # テストの後、書式とスタイルを検査
```

## ビルド

```bash
mvn clean     # ビルド成果物（target/）を削除
mvn package   # target/app-1.0-SNAPSHOT.jar を作成
```

パッケージ化した後、次のコマンドでアプリケーションを実行できます。

```bash
java -jar target/app-1.0-SNAPSHOT.jar
```

## コードスタイル

Javaコードは[Google Java Format](https://github.com/google/google-java-format)に従います。書式は[Spotless](https://github.com/diffplug/spotless)で適用し、[Checkstyle](https://checkstyle.org/)の `google_checks.xml` ルールで検査します。

```bash
mvn spotless:apply   # コードを整形
mvn verify           # 書式・スタイル違反があれば失敗
```

詳細は[Javaコード規約](./.github/instructions/java.instructions.md)を参照してください。

## コミットメッセージ

コミットメッセージは[Conventional Commits](https://www.conventionalcommits.org/ja/v1.0.0/)に従います。例: `feat(parser): add array parsing`。Dev Containerは、不正なメッセージを拒否する `commit-msg` フックを設定します。詳細は[コミットメッセージの指示](./.github/instructions/commit.instructions.md)を参照してください。

## 設定

データベースの設定は[application.properties](./src/main/resources/application.properties)にあります。サンプルの値は自分の環境に合わせて置き換え、実際の認証情報はコミットしないでください。
