package org.apereo.cas.web.flow.client;

import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.adaptors.ldap.LdapIntegrationTestsOperations;
import org.apereo.cas.util.junit.ConditionalIgnore;
import org.apereo.cas.util.junit.ConditionalSpringRunner;
import org.apereo.cas.util.junit.RunningStandaloneCondition;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.TestPropertySource;

/**
 * Test cases for {@link LdapSpnegoKnownClientSystemsFilterAction}.
 *
 * @author Misagh Moayyed
 * @since 4.1
 */
@TestPropertySource(locations = {"classpath:/spnego.properties", "classpath:/spnego-ldap.properties"})
@Slf4j
@RunWith(ConditionalSpringRunner.class)
@ConditionalIgnore(condition = RunningStandaloneCondition.class)
public class LdapSpnegoKnownClientSystemsFilterActionTests extends BaseLdapSpnegoKnownClientSystemsFilterActionTests {

    @BeforeClass
    public static void bootstrap() throws Exception {
        LdapIntegrationTestsOperations.initDirectoryServer(1381);
    }
}
