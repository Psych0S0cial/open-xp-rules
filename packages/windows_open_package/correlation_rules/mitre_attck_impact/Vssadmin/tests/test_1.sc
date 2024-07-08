{"action":"start","category.generic":"Process","category.high":"Availability Management","category.low":"Control","datafield6":"ceed3963-b528-649f-63d9-060000000000","event_src.category":"Other","event_src.fqdn":"pc1","event_src.host":"pc1","event_src.hostname":"pc1","event_src.rule":"technique_id=T1059.001,technique_name=PowerShell","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.2.3282","id":"PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation","importance":"info","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"1","normalized":true,"object":"process","object.account.domain":"pc1","object.account.id":"synthetic:arss@pc1","object.account.name":"arss","object.account.privileges":"High","object.account.session_id":"448867","object.process.cmdline":"\"C:\\Windows\\system32\\vssadmin.exe\" delete shadows /all","object.process.cwd":"C:\\Windows\\system32\\","object.process.fullpath":"c:\\windows\\system32\\vssadmin.exe","object.process.guid":"ceed3963-b8ef-649f-5701-000000001e00","object.process.hash.imphash":"C1EDC431CD345F0A0F32019895D13FCE","object.process.hash.md5":"B58073DB8892B67A672906C9358020EC","object.process.hash.sha1":"AAFE91BDC580260E4EF7FABC6B273FF0AE1E703F","object.process.hash.sha256":"8C1FABCC2196E4D096B7D155837C5F699AD7F55EDBF84571E4F8E03500B7A8B0","object.process.id":"3860","object.process.meta":"Description:Command Line Interface for Microsoft® Volume Shadow Copy Service | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation","object.process.name":"vssadmin.exe","object.process.original_name":"VSSADMIN.EXE","object.process.parent.cmdline":"\"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\powershell.exe\"","object.process.parent.fullpath":"c:\\windows\\system32\\windowspowershell\\v1.0\\powershell.exe","object.process.parent.guid":"ceed3963-b783-649f-1201-000000001e00","object.process.parent.id":"4612","object.process.parent.name":"powershell.exe","object.process.parent.path":"c:\\windows\\system32\\windowspowershell\\v1.0\\","object.process.path":"c:\\windows\\system32\\","object.process.version":"10.0.19041.1 (WinBuild.160101.0800)","recv_ipv4":"127.0.0.1","recv_time":"2023-07-01T06:00:03.187Z","status":"success","subject":"account","subject.account.domain":"pc1","subject.account.id":"synthetic:arss@pc1","subject.account.name":"arss","subject.account.privileges":"High","subject.account.session_id":"448867","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.220-release-26.0","time":"2023-07-01T05:26:07.504Z","type":"raw","uuid":"e7b8cc92-4d4f-4f12-b57a-0f8fa72fba5e"}

expect 1 {"action":"create","alert.context":"arss run \"C:\\Windows\\system32\\vssadmin.exe\" delete shadows /all via powershell.exe","alert.key":"\"C:\\Windows\\system32\\vssadmin.exe\" delete shadows /all","category.generic":"Information Management","category.high":"Impact","category.low":"Inhibit System Recovery","correlation_name":"Vssadmin","correlation_type":"event","count":1,"datafield6":"ceed3963-b528-649f-63d9-060000000000","event_src.category":"Other","event_src.host":"pc1","event_src.hostname":"pc1","event_src.rule":"technique_id=T1059.001,technique_name=PowerShell","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"correlationengine","importance":"high","normalized":true,"object":"process","object.account.domain":"pc1","object.account.id":"synthetic:arss@pc1","object.account.name":"arss","object.account.privileges":"High","object.account.session_id":"448867","object.process.cmdline":"\"C:\\Windows\\system32\\vssadmin.exe\" delete shadows /all","object.process.cwd":"C:\\Windows\\system32\\","object.process.fullpath":"c:\\windows\\system32\\vssadmin.exe","object.process.guid":"ceed3963-b8ef-649f-5701-000000001e00","object.process.hash.md5":"B58073DB8892B67A672906C9358020EC","object.process.hash.sha1":"AAFE91BDC580260E4EF7FABC6B273FF0AE1E703F","object.process.hash.sha256":"8C1FABCC2196E4D096B7D155837C5F699AD7F55EDBF84571E4F8E03500B7A8B0","object.process.id":"3860","object.process.meta":"Description:Command Line Interface for Microsoft® Volume Shadow Copy Service | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation","object.process.name":"vssadmin.exe","object.process.original_name":"VSSADMIN.EXE","object.process.parent.cmdline":"\"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\powershell.exe\"","object.process.parent.fullpath":"c:\\windows\\system32\\windowspowershell\\v1.0\\powershell.exe","object.process.parent.id":"4612","object.process.parent.name":"powershell.exe","object.process.parent.path":"c:\\windows\\system32\\windowspowershell\\v1.0\\","object.process.path":"c:\\windows\\system32\\","object.process.version":"10.0.19041.1 (WinBuild.160101.0800)","status":"success","subject":"account","subject.account.domain":"pc1","subject.account.id":"synthetic:arss@pc1","subject.account.name":"arss","subject.account.privileges":"High","subject.account.session_id":"448867"}