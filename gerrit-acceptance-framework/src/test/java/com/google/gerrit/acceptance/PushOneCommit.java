      "\n" +
      "diff --git a/a.txt b/a.txt\n" +
      "new file mode 100644\n" +
      "index 0000000..f0eec86\n" +
      "--- /dev/null\n" +
      "+++ b/a.txt\n" +
      "@@ -0,0 +1 @@\n" +
      "+some content\n" +
      "\\ No newline at end of file\n";
    return new Result(ref, pushHead(testRepo, ref, tag != null, force), c,
        subject);